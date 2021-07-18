public class SoftwareEngineer extends TechnicalEmployee{

    boolean codeAccess;
    TechnicalLead manager;

    public SoftwareEngineer(String name) {
        super(name);
        setCodeAccess(false);
        //checkInCode();
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean access) {
        codeAccess = access;
        getCodeAccess();
    }

    public int getSuccessfulCheckIns() {
        return checkIn++;
    }

    // need to double check the 2 next methods
    public boolean checkInCode() {
        if (manager.approveCheckIn(this)) {
            getSuccessfulCheckIns();
            return true;
        }
        else {
            return false;
        }
    }

    public Employee getManager() {
        return this.manager;
    }


}