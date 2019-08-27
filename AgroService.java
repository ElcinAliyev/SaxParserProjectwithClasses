import java.math.BigDecimal;

public class AgroService {

    private int id; // Sira nomresi
    private String name; // Xidmetin novu
  private String size; // Olcu vahidi
  private String salary; // Qiymeti
    private String agroTechol; // Agrotechol

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "AgroService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", salary='" + salary + '\'' +
                ", agroTechol='" + agroTechol + '\'' +
                '}';
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAgroTechol() {
        return agroTechol;
    }

    public void setAgroTechol(String agroTechol) {
        this.agroTechol = agroTechol;
    }
}