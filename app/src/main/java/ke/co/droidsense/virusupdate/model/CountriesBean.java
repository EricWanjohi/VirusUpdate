package ke.co.droidsense.virusupdate.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "CountriesBean")
public class CountriesBean {

    /**
     * Country : Afghanistan
     * CountryCode : AF
     * Slug : afghanistan
     * NewConfirmed : 262
     * TotalConfirmed : 6664
     * NewDeaths : 1
     * TotalDeaths : 169
     * NewRecovered : 33
     * TotalRecovered : 778
     * Date : 2020-05-18T13:54:17Z
     */

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String Country;
    private String CountryCode;
    private String Slug;
    private int NewConfirmed;
    private int TotalConfirmed;
    private int NewDeaths;
    private int TotalDeaths;
    private int NewRecovered;
    private int TotalRecovered;
    private String Date;

    //Getters and Setters...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getSlug() {
        return Slug;
    }

    public void setSlug(String Slug) {
        this.Slug = Slug;
    }

    public int getNewConfirmed() {
        return NewConfirmed;
    }

    public void setNewConfirmed(int NewConfirmed) {
        this.NewConfirmed = NewConfirmed;
    }

    public int getTotalConfirmed() {
        return TotalConfirmed;
    }

    public void setTotalConfirmed(int TotalConfirmed) {
        this.TotalConfirmed = TotalConfirmed;
    }

    public int getNewDeaths() {
        return NewDeaths;
    }

    public void setNewDeaths(int NewDeaths) {
        this.NewDeaths = NewDeaths;
    }

    public int getTotalDeaths() {
        return TotalDeaths;
    }

    public void setTotalDeaths(int TotalDeaths) {
        this.TotalDeaths = TotalDeaths;
    }

    public int getNewRecovered() {
        return NewRecovered;
    }

    public void setNewRecovered(int NewRecovered) {
        this.NewRecovered = NewRecovered;
    }

    public int getTotalRecovered() {
        return TotalRecovered;
    }

    public void setTotalRecovered(int TotalRecovered) {
        this.TotalRecovered = TotalRecovered;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
}
