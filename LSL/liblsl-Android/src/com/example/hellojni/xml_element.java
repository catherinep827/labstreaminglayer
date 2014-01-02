/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.example.hellojni;

public class xml_element {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected xml_element(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(xml_element obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        lslAndroidJNI.delete_xml_element(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public xml_element() {
    this(lslAndroidJNI.new_xml_element__SWIG_0(), true);
  }

  public xml_element(SWIGTYPE_p_pugi__xml_node node) {
    this(lslAndroidJNI.new_xml_element__SWIG_1(SWIGTYPE_p_pugi__xml_node.getCPtr(node)), true);
  }

  public xml_element first_child() {
    return new xml_element(lslAndroidJNI.xml_element_first_child(swigCPtr, this), true);
  }

  public xml_element last_child() {
    return new xml_element(lslAndroidJNI.xml_element_last_child(swigCPtr, this), true);
  }

  public xml_element next_sibling() {
    return new xml_element(lslAndroidJNI.xml_element_next_sibling__SWIG_0(swigCPtr, this), true);
  }

  public xml_element previous_sibling() {
    return new xml_element(lslAndroidJNI.xml_element_previous_sibling__SWIG_0(swigCPtr, this), true);
  }

  public xml_element parent() {
    return new xml_element(lslAndroidJNI.xml_element_parent(swigCPtr, this), true);
  }

  public xml_element child(String name) {
    return new xml_element(lslAndroidJNI.xml_element_child(swigCPtr, this, name), true);
  }

  public xml_element next_sibling(String name) {
    return new xml_element(lslAndroidJNI.xml_element_next_sibling__SWIG_1(swigCPtr, this, name), true);
  }

  public xml_element previous_sibling(String name) {
    return new xml_element(lslAndroidJNI.xml_element_previous_sibling__SWIG_1(swigCPtr, this, name), true);
  }

  public boolean empty() {
    return lslAndroidJNI.xml_element_empty(swigCPtr, this);
  }

  public boolean is_text() {
    return lslAndroidJNI.xml_element_is_text(swigCPtr, this);
  }

  public String name() {
    return lslAndroidJNI.xml_element_name(swigCPtr, this);
  }

  public String value() {
    return lslAndroidJNI.xml_element_value(swigCPtr, this);
  }

  public String child_value() {
    return lslAndroidJNI.xml_element_child_value__SWIG_0(swigCPtr, this);
  }

  public String child_value(String name) {
    return lslAndroidJNI.xml_element_child_value__SWIG_1(swigCPtr, this, name);
  }

  public xml_element append_child_value(String name, String value) {
    return new xml_element(lslAndroidJNI.xml_element_append_child_value(swigCPtr, this, name, value), true);
  }

  public xml_element prepend_child_value(String name, String value) {
    return new xml_element(lslAndroidJNI.xml_element_prepend_child_value(swigCPtr, this, name, value), true);
  }

  public boolean set_child_value(String name, String value) {
    return lslAndroidJNI.xml_element_set_child_value(swigCPtr, this, name, value);
  }

  public boolean set_name(String rhs) {
    return lslAndroidJNI.xml_element_set_name(swigCPtr, this, rhs);
  }

  public boolean set_value(String rhs) {
    return lslAndroidJNI.xml_element_set_value(swigCPtr, this, rhs);
  }

  public xml_element append_child(String name) {
    return new xml_element(lslAndroidJNI.xml_element_append_child(swigCPtr, this, name), true);
  }

  public xml_element prepend_child(String name) {
    return new xml_element(lslAndroidJNI.xml_element_prepend_child(swigCPtr, this, name), true);
  }

  public xml_element append_copy(xml_element e) {
    return new xml_element(lslAndroidJNI.xml_element_append_copy(swigCPtr, this, xml_element.getCPtr(e), e), true);
  }

  public xml_element prepend_copy(xml_element e) {
    return new xml_element(lslAndroidJNI.xml_element_prepend_copy(swigCPtr, this, xml_element.getCPtr(e), e), true);
  }

  public void remove_child(String name) {
    lslAndroidJNI.xml_element_remove_child__SWIG_0(swigCPtr, this, name);
  }

  public void remove_child(xml_element e) {
    lslAndroidJNI.xml_element_remove_child__SWIG_1(swigCPtr, this, xml_element.getCPtr(e), e);
  }

  public SWIGTYPE_p_pugi__xml_node_struct ptr() {
    long cPtr = lslAndroidJNI.xml_element_ptr(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_pugi__xml_node_struct(cPtr, false);
  }

}
