package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LocationsByIdQueryObject extends QueryObject{
    private String id;

    /**
     * @return the Id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the Id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    private LocationRetrievalDepth retrievalDepth;

    /**
     * @return the RetrievalDepth
     */
    public LocationRetrievalDepth getRetrievalDepth() {
        return retrievalDepth;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(LocationRetrievalDepth retrievalDepth) {
        this.retrievalDepth = retrievalDepth;
    }

}
