package ke.co.droidsense.virusupdate.model;

import java.util.List;

public class SummaryResponse {

    /**
     * Global : {"NewConfirmed":80678,"TotalConfirmed":4791229,"NewDeaths":3507,"TotalDeaths":321071,"NewRecovered":40774,"TotalRecovered":1733320}
     * Countries : [{"Country":"Afghanistan","CountryCode":"AF","Slug":"afghanistan","NewConfirmed":262,"TotalConfirmed":6664,"NewDeaths":1,"TotalDeaths":169,"NewRecovered":33,"TotalRecovered":778,"Date":"2020-05-18T13:54:17Z"},{"Country":"Albania","CountryCode":"AL","Slug":"albania","NewConfirmed":13,"TotalConfirmed":946,"NewDeaths":0,"TotalDeaths":31,"NewRecovered":1,"TotalRecovered":715,"Date":"2020-05-18T13:54:17Z"},{"Country":"Algeria","CountryCode":"DZ","Slug":"algeria","NewConfirmed":198,"TotalConfirmed":7019,"NewDeaths":6,"TotalDeaths":548,"NewRecovered":98,"TotalRecovered":3507,"Date":"2020-05-18T13:54:17Z"},{"Country":"Andorra","CountryCode":"AD","Slug":"andorra","NewConfirmed":0,"TotalConfirmed":761,"NewDeaths":0,"TotalDeaths":51,"NewRecovered":2,"TotalRecovered":617,"Date":"2020-05-18T13:54:17Z"},{"Country":"Angola","CountryCode":"AO","Slug":"angola","NewConfirmed":0,"TotalConfirmed":48,"NewDeaths":0,"TotalDeaths":2,"NewRecovered":0,"TotalRecovered":17,"Date":"2020-05-18T13:54:17Z"},{"Country":"Antigua and Barbuda","CountryCode":"AG","Slug":"antigua-and-barbuda","NewConfirmed":0,"TotalConfirmed":25,"NewDeaths":0,"TotalDeaths":3,"NewRecovered":0,"TotalRecovered":19,"Date":"2020-05-18T13:54:17Z"}]
     */

    private GlobalBean Global;
    private List<CountriesBean> Countries;

    public GlobalBean getGlobal() {
        return Global;
    }

    public void setGlobal(GlobalBean Global) {
        this.Global = Global;
    }

    public List<CountriesBean> getCountries() {
        return Countries;
    }

    public void setCountries(List<CountriesBean> Countries) {
        this.Countries = Countries;
    }
}
