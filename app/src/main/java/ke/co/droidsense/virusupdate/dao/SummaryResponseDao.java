package ke.co.droidsense.virusupdate.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import ke.co.droidsense.virusupdate.model.SummaryResponse;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface SummaryResponseDao {

    //Query all summary responses...
    @Query( "SELECT * FROM SummaryResponse" )
    LiveData<SummaryResponse> getAllSummaryResponse();

    //Insert all summary response...
    @Insert(onConflict = REPLACE)
    void addSummaryResponse(SummaryResponse summaryResponse);

    //Delete all summary response...
    void deleteSummaryResponse(SummaryResponse summaryResponse);

    //Update all summary response...
    void updateSummaryResponse(SummaryResponse summaryResponse);
}
