package ke.co.droidsense.virusupdate.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;

import ke.co.droidsense.virusupdate.RetrofitClient.RetrofitClient;
import ke.co.droidsense.virusupdate.api.Covid19Api;
import ke.co.droidsense.virusupdate.dao.SummaryResponseDao;
import ke.co.droidsense.virusupdate.database.Covid19Database;
import ke.co.droidsense.virusupdate.model.SummaryResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class Covid_19_Repository {

    //Member Variables...
    private static Covid_19_Repository covid_19_repository;
    private Covid19Database covid19Database;
    private SummaryResponseDao summaryResponseDao;
    private Covid19Api covid19Api;
    private LiveData<SummaryResponse> summaryResponseLiveData = new MediatorLiveData<>();

    //Repository constructor...
    private Covid_19_Repository(Context context) {
        //Initializations...
        covid19Database = Covid19Database.getCovid19DbInstance( context );
        summaryResponseDao = covid19Database.summaryResponseDao();
        covid19Api = RetrofitClient.getRetrofit().create(Covid19Api.class);
        summaryResponseLiveData = summaryResponseDao.getAllSummaryResponse();
    }

    //Repository instance getter...
    public static Covid_19_Repository getCovid_19_repository(Context context) {
        //Check if instance is null...
        if (covid_19_repository == null){
            //Create new instance...
            covid_19_repository = new Covid_19_Repository(context);
        }
        return covid_19_repository;
    }

    //Get All Summary Response...
    public MutableLiveData<SummaryResponse> getSummaryReport(){
        //Create data object holder...
        MutableLiveData<SummaryResponse> summaryResponseMutableLiveData = new MediatorLiveData<>();

        covid19Api.getSummary().enqueue( new Callback<SummaryResponse>() {
            @Override
            public void onResponse(Call<SummaryResponse> call, Response<SummaryResponse> response) {
                //Check response is successful...
                if (response.isSuccessful()){
                    //Add response object to data object...
                    summaryResponseMutableLiveData.setValue( response.body() );
                }
            }

            @Override
            public void onFailure(Call<SummaryResponse> call, Throwable throwable) {
                //Show error message...
                Timber.e( throwable.getMessage() );
            }
        } );

        return summaryResponseMutableLiveData;
    }
}
