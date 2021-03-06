/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcAccountregisterField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcAccountregisterField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAccountregisterField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcAccountregisterField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeDay(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_TradeDay_set(swigCPtr, this, value);
  }

  public String getTradeDay() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_TradeDay_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_BankBranchID_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_BankAccount_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_AccountID_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_CustomerName_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_CurrencyID_get(swigCPtr, this);
  }

  public void setOpenOrDestroy(char value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_OpenOrDestroy_set(swigCPtr, this, value);
  }

  public char getOpenOrDestroy() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_OpenOrDestroy_get(swigCPtr, this);
  }

  public void setRegDate(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_RegDate_set(swigCPtr, this, value);
  }

  public String getRegDate() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_RegDate_get(swigCPtr, this);
  }

  public void setOutDate(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_OutDate_set(swigCPtr, this, value);
  }

  public String getOutDate() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_OutDate_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_TID_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_CustType_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_BankAccType_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    thostmduserapiJNI.CThostFtdcAccountregisterField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return thostmduserapiJNI.CThostFtdcAccountregisterField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcAccountregisterField() {
    this(thostmduserapiJNI.new_CThostFtdcAccountregisterField(), true);
  }

}
