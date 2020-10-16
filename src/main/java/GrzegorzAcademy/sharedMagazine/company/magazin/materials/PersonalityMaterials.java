package GrzegorzAcademy.sharedMagazine.company.magazin.materials;

import java.util.Objects;

public class PersonalityMaterials {
    private String name;
    private String dateOfProduction;
    private String useByDate;
    private String dateOfAdmission;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getUseByDate() {
        return useByDate;
    }

    public void setUseByDate(String useByDate) {
        this.useByDate = useByDate;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalityMaterials that = (PersonalityMaterials) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(dateOfProduction, that.dateOfProduction) &&
                Objects.equals(useByDate, that.useByDate) &&
                Objects.equals(dateOfAdmission, that.dateOfAdmission) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfProduction, useByDate, dateOfAdmission, description);
    }
}
