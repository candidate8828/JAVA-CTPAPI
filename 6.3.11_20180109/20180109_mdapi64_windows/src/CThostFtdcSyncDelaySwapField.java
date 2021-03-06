/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcSyncDelaySwapField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSyncDelaySwapField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDelaySwapField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcSyncDelaySwapField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDelaySwapSeqNo(String value) {
    thostmduserapiJNI.CThostFtdcSyncDelaySwapField_DelaySwapSeqNo_set(swigCPtr, this, value);
  }

  public String getDelaySwapSeqNo() {
    return thostmduserapiJNI.CThostFtdcSyncDelaySwapField_DelaySwapSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcSyncDelaySwapField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcSyncDelaySwapField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcSyncDelaySwapField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcSyncDelaySwapField_InvestorID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcSyncDelaySwapField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return thostmduserapiJNI.CThostFtdcSyncDelaySwapField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setFromAmount(double value) {
    thostmduserapiJNI.CThostFtdcSyncDelaySwapField_FromAmount_set(swigCPtr, this, value);
  }

  public double getFromAmount() {
    return thostmduserapiJNI.CThostFtdcSyncDelaySwapField_FromAmount_get(swigCPtr, this);
  }

  public void setFromFrozenSwap(double value) {
    thostmduserapiJNI.CThostFtdcSyncDelaySwapField_FromFrozenSwap_set(swigCPtr, this, value);
  }

  public double getFromFrozenSwap() {
    return thostmduserapiJNI.CThostFtdcSyncDelaySwapField_FromFrozenSwap_get(swigCPtr, this);
  }

  public void setFromRemainSwap(double value) {
    thostmduserapiJNI.CThostFtdcSyncDelaySwapField_FromRemainSwap_set(swigCPtr, this, value);
  }

  public double getFromRemainSwap() {
    return thostmduserapiJNI.CThostFtdcSyncDelaySwapField_FromRemainSwap_get(swigCPtr, this);
  }

  public void setToCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcSyncDelaySwapField_ToCurrencyID_set(swigCPtr, this, value);
  }

  public String getToCurrencyID() {
    return thostmduserapiJNI.CThostFtdcSyncDelaySwapField_ToCurrencyID_get(swigCPtr, this);
  }

  public void setToAmount(double value) {
    thostmduserapiJNI.CThostFtdcSyncDelaySwapField_ToAmount_set(swigCPtr, this, value);
  }

  public double getToAmount() {
    return thostmduserapiJNI.CThostFtdcSyncDelaySwapField_ToAmount_get(swigCPtr, this);
  }

  public CThostFtdcSyncDelaySwapField() {
    this(thostmduserapiJNI.new_CThostFtdcSyncDelaySwapField(), true);
  }

}
