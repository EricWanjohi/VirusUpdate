package ke.co.droidsense.virusupdate.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import ke.co.droidsense.virusupdate.model.SummaryResponse;
import ke.co.droidsense.virusupdate.repository.Covid_19_Repository;

public class SummaryResponseViewModel extends AndroidViewModel {

    //Member Variables...
    private LiveData<SummaryResponse> summaryResponseLiveData;
    private Covid_19_Repository covid_19_repository;

    //ViewModel Constructor...
    public SummaryResponseViewModel(@NonNull Application application) {
        super( application );

        //Initialize ViewModel...
        initializeViewModel(application);
    }

    //Method to init objects...
    private void initializeViewModel(Application application) {
        //Check if liveData object is null...
        if (summaryResponseLiveData == null){
            //Initializations...
            covid_19_repository = Covid_19_Repository.getCovid_19_repository( application );
            summaryResponseLiveData = covid_19_repository.getSummaryReport();
        }
    }

    //Getter method for the LiveData Object...
    public LiveData<SummaryResponse> getSummaryResponseLiveData() {
        return summaryResponseLiveData;
    }
}
