package tracking;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Asset {
    
    @Id
    private Long id;
    private String assetName;
    private String assetType;
    private String assetStatus;

    public Asset() {}

    public Asset(Long id, String assetName, String assetType, String assetStatus) {
        this.id = id;
        this.assetName = assetName;
        this.assetType = assetType;
        this.assetStatus = assetStatus;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
    }
}

