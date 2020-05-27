package ke.co.droidsense.virusupdate.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import ke.co.droidsense.virusupdate.ListAndStringConverters.CountriesBeanConverter;
import ke.co.droidsense.virusupdate.dao.SummaryResponseDao;
import ke.co.droidsense.virusupdate.model.CountriesBean;
import ke.co.droidsense.virusupdate.model.GlobalBean;
import ke.co.droidsense.virusupdate.model.SummaryResponse;

@TypeConverters(CountriesBeanConverter.class)
@Database( entities = {SummaryResponse.class, CountriesBean.class, GlobalBean.class}, version = 1)
public abstract class Covid19Database extends RoomDatabase {
    //Member variables.
    private static final String DATABASE = "";
    private static Covid19Database INSTANCE;

    //Database Instance getter...
    public static Covid19Database getCovid19DbInstance(Context context) {
        //Check if instance is null...
        if (INSTANCE == null){
            //Create new Instance...
            INSTANCE = Room.databaseBuilder( context, Covid19Database.class, DATABASE )
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }

    //Create Dao to access data in the Db...
    public abstract SummaryResponseDao summaryResponseDao();
}
