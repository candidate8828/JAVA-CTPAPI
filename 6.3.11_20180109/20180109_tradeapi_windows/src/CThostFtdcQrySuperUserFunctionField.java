/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thosttraderapi;

public class CThostFtdcQrySuperUserFunctionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQrySuperUserFunctionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySuperUserFunctionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcQrySuperUserFunctionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUserID(String value) {
    thosttradeapiJNI.CThostFtdcQrySuperUserFunctionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttradeapiJNI.CThostFtdcQrySuperUserFunctionField_UserID_get(swigCPtr, this);
  }

  public CThostFtdcQrySuperUserFunctionField() {
    this(thosttradeapiJNI.new_CThostFtdcQrySuperUserFunctionField(), true);
  }

}
