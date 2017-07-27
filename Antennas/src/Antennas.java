
public class Antennas {

    private String technology;
    private String rncName;
    private String rncId;
    private String nodeBName;
    private String nodeBId;
    private String enbId;
    private String nodeBLongitude;
    private String nodeBLatitude;
    private String sectorName;
    private String active;
    private String noiseFigure;
    private String antennaId;
    private String antennaModel;
    private String sectorKeywords;
    private String antennaLongitude;
    private String antennaLatitude;
    private String height;
    private String mechanicalDownTilt;
    private String azimuth;
    private String downlinkLoss;
    private String uplinkLoss;
    private String RttFixACoefficient;
    private String RttFixBCoefficient;
    private String retId;
    private String inBuilding;

    public Antennas(String technology, String rncName, String rncId, String nodeBName, String nodeBId, String enbId, String nodeBLongitude, String nodeBLatitude, String sectorName, String active, String noiseFigure, String antennaId, String antennaModel, String sectorKeywords, String antennaLongitude, String antennaLatitude, String height, String mechanicalDownTilt, String azimuth, String downlinkLoss, String uplinkLoss, String rttFixACoefficient, String rttFixBCoefficient, String retId, String inBuilding) {
        this.technology = technology;
        this.rncName = rncName;
        this.rncId = rncId;
        this.nodeBName = nodeBName;
        this.nodeBId = nodeBId;
        this.enbId = enbId;
        this.nodeBLongitude = nodeBLongitude;
        this.nodeBLatitude = nodeBLatitude;
        this.sectorName = sectorName;
        this.active = active;
        this.noiseFigure = noiseFigure;
        this.antennaId = antennaId;
        this.antennaModel = antennaModel;
        this.sectorKeywords = sectorKeywords;
        this.antennaLongitude = antennaLongitude;
        this.antennaLatitude = antennaLatitude;
        this.height = height;
        this.mechanicalDownTilt = mechanicalDownTilt;
        this.azimuth = azimuth;
        this.downlinkLoss = downlinkLoss;
        this.uplinkLoss = uplinkLoss;
        RttFixACoefficient = rttFixACoefficient;
        RttFixBCoefficient = rttFixBCoefficient;
        this.retId = retId;
        this.inBuilding = inBuilding;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getRncName() {
        return rncName;
    }

    public void setRncName(String rncName) {
        this.rncName = rncName;
    }

    public String getRncId() {
        return rncId;
    }

    public void setRncId(String rncId) {
        this.rncId = rncId;
    }

    public String getNodeBName() {
        return nodeBName;
    }

    public void setNodeBName(String nodeBName) {
        this.nodeBName = nodeBName;
    }

    public String getNodeBId() {
        return nodeBId;
    }

    public void setNodeBId(String nodeBId) {
        this.nodeBId = nodeBId;
    }

    public String getEnbId() {
        return enbId;
    }

    public void setEnbId(String enbId) {
        this.enbId = enbId;
    }

    public String getNodeBLongitude() {
        return nodeBLongitude;
    }

    public void setNodeBLongitude(String nodeBLongitude) {
        this.nodeBLongitude = nodeBLongitude;
    }

    public String getNodeBLatitude() {
        return nodeBLatitude;
    }

    public void setNodeBLatitude(String nodeBLatitude) {
        this.nodeBLatitude = nodeBLatitude;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getNoiseFigure() {
        return noiseFigure;
    }

    public void setNoiseFigure(String noiseFigure) {
        this.noiseFigure = noiseFigure;
    }

    public String getAntennaId() {
        return antennaId;
    }

    public void setAntennaId(String antennaId) {
        this.antennaId = antennaId;
    }

    public String getAntennaModel() {
        return antennaModel;
    }

    public void setAntennaModel(String antennaModel) {
        this.antennaModel = antennaModel;
    }

    public String getSectorKeywords() {
        return sectorKeywords;
    }

    public void setSectorKeywords(String sectorKeywords) {
        this.sectorKeywords = sectorKeywords;
    }

    public String getAntennaLongitude() {
        return antennaLongitude;
    }

    public void setAntennaLongitude(String antennaLongitude) {
        this.antennaLongitude = antennaLongitude;
    }

    public String getAntennaLatitude() {
        return antennaLatitude;
    }

    public void setAntennaLatitude(String antennaLatitude) {
        this.antennaLatitude = antennaLatitude;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMechanicalDownTilt() {
        return mechanicalDownTilt;
    }

    public void setMechanicalDownTilt(String mechanicalDownTilt) {
        this.mechanicalDownTilt = mechanicalDownTilt;
    }

    public String getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(String azimuth) {
        this.azimuth = azimuth;
    }

    public String getDownlinkLoss() {
        return downlinkLoss;
    }

    public void setDownlinkLoss(String downlinkLoss) {
        this.downlinkLoss = downlinkLoss;
    }

    public String getUplinkLoss() {
        return uplinkLoss;
    }

    public void setUplinkLoss(String uplinkLoss) {
        this.uplinkLoss = uplinkLoss;
    }

    public String getRttFixACoefficient() {
        return RttFixACoefficient;
    }

    public void setRttFixACoefficient(String rttFixACoefficient) {
        RttFixACoefficient = rttFixACoefficient;
    }

    public String getRttFixBCoefficient() {
        return RttFixBCoefficient;
    }

    public void setRttFixBCoefficient(String rttFixBCoefficient) {
        RttFixBCoefficient = rttFixBCoefficient;
    }

    public String getRetId() {
        return retId;
    }

    public void setRetId(String retId) {
        this.retId = retId;
    }

    public String getInBuilding() {
        return inBuilding;
    }

    public void setInBuilding(String inBuilding) {
        this.inBuilding = inBuilding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Antennas antennas = (Antennas) o;

        if (technology != null ? !technology.equals(antennas.technology) : antennas.technology != null) return false;
        if (rncName != null ? !rncName.equals(antennas.rncName) : antennas.rncName != null) return false;
        if (rncId != null ? !rncId.equals(antennas.rncId) : antennas.rncId != null) return false;
        if (nodeBName != null ? !nodeBName.equals(antennas.nodeBName) : antennas.nodeBName != null) return false;
        if (nodeBId != null ? !nodeBId.equals(antennas.nodeBId) : antennas.nodeBId != null) return false;
        if (enbId != null ? !enbId.equals(antennas.enbId) : antennas.enbId != null) return false;
        if (nodeBLongitude != null ? !nodeBLongitude.equals(antennas.nodeBLongitude) : antennas.nodeBLongitude != null)
            return false;
        if (nodeBLatitude != null ? !nodeBLatitude.equals(antennas.nodeBLatitude) : antennas.nodeBLatitude != null)
            return false;
        if (sectorName != null ? !sectorName.equals(antennas.sectorName) : antennas.sectorName != null) return false;
        if (active != null ? !active.equals(antennas.active) : antennas.active != null) return false;
        if (noiseFigure != null ? !noiseFigure.equals(antennas.noiseFigure) : antennas.noiseFigure != null)
            return false;
        if (antennaId != null ? !antennaId.equals(antennas.antennaId) : antennas.antennaId != null) return false;
        if (antennaModel != null ? !antennaModel.equals(antennas.antennaModel) : antennas.antennaModel != null)
            return false;
        if (sectorKeywords != null ? !sectorKeywords.equals(antennas.sectorKeywords) : antennas.sectorKeywords != null)
            return false;
        if (antennaLongitude != null ? !antennaLongitude.equals(antennas.antennaLongitude) : antennas.antennaLongitude != null)
            return false;
        if (antennaLatitude != null ? !antennaLatitude.equals(antennas.antennaLatitude) : antennas.antennaLatitude != null)
            return false;
        if (height != null ? !height.equals(antennas.height) : antennas.height != null) return false;
        if (mechanicalDownTilt != null ? !mechanicalDownTilt.equals(antennas.mechanicalDownTilt) : antennas.mechanicalDownTilt != null)
            return false;
        if (azimuth != null ? !azimuth.equals(antennas.azimuth) : antennas.azimuth != null) return false;
        if (downlinkLoss != null ? !downlinkLoss.equals(antennas.downlinkLoss) : antennas.downlinkLoss != null)
            return false;
        if (uplinkLoss != null ? !uplinkLoss.equals(antennas.uplinkLoss) : antennas.uplinkLoss != null) return false;
        if (RttFixACoefficient != null ? !RttFixACoefficient.equals(antennas.RttFixACoefficient) : antennas.RttFixACoefficient != null)
            return false;
        if (RttFixBCoefficient != null ? !RttFixBCoefficient.equals(antennas.RttFixBCoefficient) : antennas.RttFixBCoefficient != null)
            return false;
        if (retId != null ? !retId.equals(antennas.retId) : antennas.retId != null) return false;
        return inBuilding != null ? inBuilding.equals(antennas.inBuilding) : antennas.inBuilding == null;
    }

    @Override
    public int hashCode() {
        int result = technology != null ? technology.hashCode() : 0;
        result = 31 * result + (rncName != null ? rncName.hashCode() : 0);
        result = 31 * result + (rncId != null ? rncId.hashCode() : 0);
        result = 31 * result + (nodeBName != null ? nodeBName.hashCode() : 0);
        result = 31 * result + (nodeBId != null ? nodeBId.hashCode() : 0);
        result = 31 * result + (enbId != null ? enbId.hashCode() : 0);
        result = 31 * result + (nodeBLongitude != null ? nodeBLongitude.hashCode() : 0);
        result = 31 * result + (nodeBLatitude != null ? nodeBLatitude.hashCode() : 0);
        result = 31 * result + (sectorName != null ? sectorName.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (noiseFigure != null ? noiseFigure.hashCode() : 0);
        result = 31 * result + (antennaId != null ? antennaId.hashCode() : 0);
        result = 31 * result + (antennaModel != null ? antennaModel.hashCode() : 0);
        result = 31 * result + (sectorKeywords != null ? sectorKeywords.hashCode() : 0);
        result = 31 * result + (antennaLongitude != null ? antennaLongitude.hashCode() : 0);
        result = 31 * result + (antennaLatitude != null ? antennaLatitude.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (mechanicalDownTilt != null ? mechanicalDownTilt.hashCode() : 0);
        result = 31 * result + (azimuth != null ? azimuth.hashCode() : 0);
        result = 31 * result + (downlinkLoss != null ? downlinkLoss.hashCode() : 0);
        result = 31 * result + (uplinkLoss != null ? uplinkLoss.hashCode() : 0);
        result = 31 * result + (RttFixACoefficient != null ? RttFixACoefficient.hashCode() : 0);
        result = 31 * result + (RttFixBCoefficient != null ? RttFixBCoefficient.hashCode() : 0);
        result = 31 * result + (retId != null ? retId.hashCode() : 0);
        result = 31 * result + (inBuilding != null ? inBuilding.hashCode() : 0);
        return result;
    }
}
