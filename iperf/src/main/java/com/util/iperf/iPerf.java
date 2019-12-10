/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.util.iperf;

public class iPerf extends iPerfResultCallbacks {
  private transient long swigCPtr;

  protected iPerf(long cPtr, boolean cMemoryOwn) {
    super(libiperfJNI.iPerf_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(iPerf obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libiperfJNI.delete_iPerf(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    libiperfJNI.iPerf_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    libiperfJNI.iPerf_change_ownership(this, swigCPtr, true);
  }

  public iPerf(String hostname, int port, String streamTemplate, int duration, int interval, boolean download) {
    this(libiperfJNI.new_iPerf(hostname, port, streamTemplate, duration, interval, download), true);
    libiperfJNI.iPerf_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void deInit() {
    libiperfJNI.iPerf_deInit(swigCPtr, this);
  }

  public void init() {
    libiperfJNI.iPerf_init(swigCPtr, this);
  }

  public void run() {
    libiperfJNI.iPerf_run(swigCPtr, this);
  }

  public String getHostname() {
    return libiperfJNI.iPerf_getHostname(swigCPtr, this);
  }

  public void setHostname(String hostname) {
    libiperfJNI.iPerf_setHostname(swigCPtr, this, hostname);
  }

  public int getPort() {
    return libiperfJNI.iPerf_getPort(swigCPtr, this);
  }

  public void setPort(int port) {
    libiperfJNI.iPerf_setPort(swigCPtr, this, port);
  }

  public String getStreamTemplate() {
    return libiperfJNI.iPerf_getStreamTemplate(swigCPtr, this);
  }

  public void setStreamTemplate(String streamTemplate) {
    libiperfJNI.iPerf_setStreamTemplate(swigCPtr, this, streamTemplate);
  }

  public int getDuration() {
    return libiperfJNI.iPerf_getDuration(swigCPtr, this);
  }

  public void setDuration(int duration) {
    libiperfJNI.iPerf_setDuration(swigCPtr, this, duration);
  }

  public int getInterval() {
    return libiperfJNI.iPerf_getInterval(swigCPtr, this);
  }

  public void setInterval(int interval) {
    libiperfJNI.iPerf_setInterval(swigCPtr, this, interval);
  }

  public boolean isDebug() {
    return libiperfJNI.iPerf_isDebug(swigCPtr, this);
  }

  public void setDebug(boolean debug) {
    libiperfJNI.iPerf_setDebug(swigCPtr, this, debug);
  }

  public boolean isDownload() {
    return libiperfJNI.iPerf_isDownload(swigCPtr, this);
  }

  public void setDownload(boolean download) {
    libiperfJNI.iPerf_setDownload(swigCPtr, this, download);
  }

  public void updatedIntermediateResult(double bits) {
    libiperfJNI.iPerf_updatedIntermediateResult(swigCPtr, this, bits);
  }

  public void updateSummaryResult() {
    libiperfJNI.iPerf_updateSummaryResult(swigCPtr, this);
  }

  public void setResults(VecDouble value) {
    libiperfJNI.iPerf_results_set(swigCPtr, this, VecDouble.getCPtr(value), value);
  }

  public VecDouble getResults() {
    long cPtr = libiperfJNI.iPerf_results_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VecDouble(cPtr, false);
  }

}