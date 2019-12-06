/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.geometerplus.android.fbreader.api;
public interface ApiInterface extends android.os.IInterface
{
  /** Default implementation for ApiInterface. */
  public static class Default implements org.geometerplus.android.fbreader.api.ApiInterface
  {
    @Override public org.geometerplus.android.fbreader.api.ApiObject request(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<org.geometerplus.android.fbreader.api.ApiObject> requestList(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.Map requestMap(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.geometerplus.android.fbreader.api.ApiInterface
  {
    private static final java.lang.String DESCRIPTOR = "org.geometerplus.android.fbreader.api.ApiInterface";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.geometerplus.android.fbreader.api.ApiInterface interface,
     * generating a proxy if needed.
     */
    public static org.geometerplus.android.fbreader.api.ApiInterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.geometerplus.android.fbreader.api.ApiInterface))) {
        return ((org.geometerplus.android.fbreader.api.ApiInterface)iin);
      }
      return new org.geometerplus.android.fbreader.api.ApiInterface.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_request:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          org.geometerplus.android.fbreader.api.ApiObject[] _arg1;
          _arg1 = data.createTypedArray(org.geometerplus.android.fbreader.api.ApiObject.CREATOR);
          org.geometerplus.android.fbreader.api.ApiObject _result = this.request(_arg0, _arg1);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_requestList:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          org.geometerplus.android.fbreader.api.ApiObject[] _arg1;
          _arg1 = data.createTypedArray(org.geometerplus.android.fbreader.api.ApiObject.CREATOR);
          java.util.List<org.geometerplus.android.fbreader.api.ApiObject> _result = this.requestList(_arg0, _arg1);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_requestMap:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          org.geometerplus.android.fbreader.api.ApiObject[] _arg1;
          _arg1 = data.createTypedArray(org.geometerplus.android.fbreader.api.ApiObject.CREATOR);
          java.util.Map _result = this.requestMap(_arg0, _arg1);
          reply.writeNoException();
          reply.writeMap(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.geometerplus.android.fbreader.api.ApiInterface
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public org.geometerplus.android.fbreader.api.ApiObject request(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.geometerplus.android.fbreader.api.ApiObject _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(method);
          _data.writeTypedArray(parameters, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_request, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().request(method, parameters);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = org.geometerplus.android.fbreader.api.ApiObject.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<org.geometerplus.android.fbreader.api.ApiObject> requestList(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<org.geometerplus.android.fbreader.api.ApiObject> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(method);
          _data.writeTypedArray(parameters, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().requestList(method, parameters);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(org.geometerplus.android.fbreader.api.ApiObject.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.Map requestMap(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.Map _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(method);
          _data.writeTypedArray(parameters, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestMap, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().requestMap(method, parameters);
          }
          _reply.readException();
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _result = _reply.readHashMap(cl);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static org.geometerplus.android.fbreader.api.ApiInterface sDefaultImpl;
    }
    static final int TRANSACTION_request = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_requestList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_requestMap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(org.geometerplus.android.fbreader.api.ApiInterface impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.geometerplus.android.fbreader.api.ApiInterface getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public org.geometerplus.android.fbreader.api.ApiObject request(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException;
  public java.util.List<org.geometerplus.android.fbreader.api.ApiObject> requestList(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException;
  public java.util.Map requestMap(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException;
}
