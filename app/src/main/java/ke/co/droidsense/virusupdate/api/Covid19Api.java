package ke.co.droidsense.virusupdate.api;

import ke.co.droidsense.virusupdate.constant.Constants;
import ke.co.droidsense.virusupdate.model.SummaryResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Covid19Api {
    @GET(Constants.SUMMARY_ENDPOINT)
    Call<SummaryResponse> getSummary();
}
