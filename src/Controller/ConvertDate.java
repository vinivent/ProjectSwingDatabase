package Controller;

public class ConvertDate {

    public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date) {
        if (date != null) {
            java.sql.Date productDate = new java.sql.Date(date.getTime());
            return productDate;
        }
        return null;
    }
}
