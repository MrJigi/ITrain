package iodigital.io_travelcoach.model;

public class Product {
    private String number;
    private String categoryCode;
    private String shortCategoryName;
    private String longCategoryName;
    private String operatorName;
    private String operatorCode;
    private String type;

    public Product(String number, String categoryCode, String shortCategoryName, String longCategoryName, String operatorName, String operatorCode, String type) {
        this.number = number;
        this.categoryCode = categoryCode;
        this.shortCategoryName = shortCategoryName;
        this.longCategoryName = longCategoryName;
        this.operatorName = operatorName;
        this.operatorCode = operatorCode;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getShortCategoryName() {
        return shortCategoryName;
    }

    public void setShortCategoryName(String shortCategoryName) {
        this.shortCategoryName = shortCategoryName;
    }

    public String getLongCategoryName() {
        return longCategoryName;
    }

    public void setLongCategoryName(String longCategoryName) {
        this.longCategoryName = longCategoryName;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
