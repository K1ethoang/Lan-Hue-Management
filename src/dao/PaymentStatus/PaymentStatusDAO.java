package dao.PaymentStatus;

import model.PaymentStatusModel;

public interface PaymentStatusDAO {

    public PaymentStatusModel getByID(int ID);

    public PaymentStatusModel getByStatusCode(int code);
}
