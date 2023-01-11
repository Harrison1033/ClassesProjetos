package teste;
//List2b
public class ClasseDois {
    private String serialNumber;
    private String marca;

    public ClasseDois(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {//Ctrl + o
        if (obj == null)return false;
        if (this == obj)return true;
        if (this.getClass()!= obj.getClass())return false;
        ClasseDois primeiraClasse = (ClasseDois) obj;
        return serialNumber != null && serialNumber.equals(primeiraClasse.serialNumber);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
