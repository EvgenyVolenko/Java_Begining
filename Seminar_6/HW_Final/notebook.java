// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

package Seminar_6.HW_Final;

public class notebook {
    private String manufacturer;
    private int ozuCapacity;
    private int hddCapacity;
    private String osType;
    private String color;

    public notebook(String manufacturer, int ozuCapacity, int hddCapacity, String osType, String color) {
        this.manufacturer = manufacturer;
        this.ozuCapacity = ozuCapacity;
        this.hddCapacity = hddCapacity;
        this.osType = osType;
        this.color = color;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setOzuCapacity(int ozuCapacity) {
        this.ozuCapacity = ozuCapacity;
    }

    public int getOzuCapacity(){
        return ozuCapacity;
    }

    public void setHddCapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
    }

    public int getHddOzuCapacity(){
        return hddCapacity;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getOsTypey(){
        return osType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return String.format("Ноутбук %s %s [RAM %d ГБ, HDD %d ГБ, ОС %s]", manufacturer, color, ozuCapacity, hddCapacity, osType);
    }

}
