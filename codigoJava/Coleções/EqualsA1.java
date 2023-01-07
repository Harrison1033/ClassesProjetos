package estudando.classe1;
//EqualsA1
public class PrimeiraClasse {
    private String serialNumber;
    private String marca;

    public PrimeiraClasse(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {//Ctrl + o
        if (obj == null)return false;
        if (this == obj)return true;
        if (this.getClass()!= obj.getClass())return false;
        PrimeiraClasse primeiraClasse = (PrimeiraClasse) obj;
        return serialNumber != null && serialNumber.equals(primeiraClasse.serialNumber);
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