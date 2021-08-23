package de.hybris.NagAcc.core.job;

import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.NagAcc.core.service.CustomOrderService;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.order.OrderService;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;

import java.util.List;

public class UpdateNumberOfOrdersOfDesignerJobPerformable extends AbstractJobPerformable<CronJobModel> {

    private OrderService orderService;
    private ModelService modelService;
    private final static Logger LOG = Logger.getLogger(UpdateNumberOfOrdersOfDesignerJobPerformable.class.getName());

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }



    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
       if(orderService instanceof CustomOrderService)
       {
           List<OrderModel> orders = ((CustomOrderService)getOrderService()).getAllOrders();
           if(orders.size() > 0)
           {
               for(OrderModel order : orders)
               {
                   if(order.getDesigner() != null)
                   {
                       DesignerModel designer = order.getDesigner();
                       Integer numberOfOrders = designer.getNumberOfOrders();
                       numberOfOrders++;
                       designer.setNumberOfOrders(numberOfOrders);
                       getModelService().save(designer);

                   }
               }
               LOG.info("Updated Number of Orders of Designers");
               return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
           }
           LOG.info("Could not update number of Orders of Designers");
           return new PerformResult(CronJobResult.FAILURE,CronJobStatus.ABORTED);
       }
        LOG.info("Could not update number of Orders of Designers");
        return new PerformResult(CronJobResult.FAILURE,CronJobStatus.ABORTED);
    }
}
