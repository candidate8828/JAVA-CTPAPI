/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcInvestorWithdrawAlgorithmField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInvestorWithdrawAlgorithmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorWithdrawAlgorithmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcInvestorWithdrawAlgorithmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thostmduserapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thostmduserapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorID_get(swigCPtr, this);
  }

  public void setUsingRatio(double value) {
    thostmduserapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_UsingRatio_set(swigCPtr, this, value);
  }

  public double getUsingRatio() {
    return thostmduserapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_UsingRatio_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_CurrencyID_get(swigCPtr, this);
  }

  public void setFundMortgageRatio(double value) {
    thostmduserapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_FundMortgageRatio_set(swigCPtr, this, value);
  }

  public double getFundMortgageRatio() {
    return thostmduserapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_FundMortgageRatio_get(swigCPtr, this);
  }

  public CThostFtdcInvestorWithdrawAlgorithmField() {
    this(thostmduserapiJNI.new_CThostFtdcInvestorWithdrawAlgorithmField(), true);
  }

}