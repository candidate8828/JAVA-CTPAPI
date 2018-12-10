/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcExecOrderActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExecOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExecOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcExecOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setExecOrderActionRef(int value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_ExecOrderActionRef_set(swigCPtr, this, value);
  }

  public int getExecOrderActionRef() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_ExecOrderActionRef_get(swigCPtr, this);
  }

  public void setExecOrderRef(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_ExecOrderRef_set(swigCPtr, this, value);
  }

  public String getExecOrderRef() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_ExecOrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setExecOrderLocalID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_ExecOrderLocalID_set(swigCPtr, this, value);
  }

  public String getExecOrderLocalID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_ExecOrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_ActionType_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmduserapiJNI.CThostFtdcExecOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmduserapiJNI.CThostFtdcExecOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExecOrderActionField() {
    this(thostmduserapiJNI.new_CThostFtdcExecOrderActionField(), true);
  }

}