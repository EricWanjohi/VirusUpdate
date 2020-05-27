package ke.co.droidsense.virusupdate.ListAndStringConverters;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import ke.co.droidsense.virusupdate.model.CountriesBean;

public class CountriesBeanConverter {

    @TypeConverter
    public static List<CountriesBean> fromCountriesBeanString(String value) {
        Type listType = new TypeToken<List<CountriesBean>>() {
        }.getType();
        return new Gson().fromJson( value, listType );
    }

    @TypeConverter
    public static String fromCountriesBeanList(List<CountriesBean> list) {
        Gson gson = new Gson();
        String json = gson.toJson( list );
        return json;
    }
}
