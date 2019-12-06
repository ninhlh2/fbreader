/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.geometerplus.android.fbreader.httpd;
public interface DataInterface extends android.os.IInterface
{
  /** Default implementation for DataInterface. */
  public static class Default implements org.geometerplus.android.fbreader.httpd.DataInterface
  {
    @Override public int getPort() throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.geometerplus.android.fbreader.httpd.DataInterface
  {
    private static final java.lang.String DESCRIPTOR = "org.geometerplus.android.fbreader.httpd.DataInterface";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.geometerplus.android.fbreader.httpd.DataInterface interface,
     * generating a proxy if needed.
     */
    public static org.geometerplus.android.fbreader.httpd.DataInterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.geometerplus.android.fbreader.httpd.DataInterface))) {
        return ((org.geometerplus.android.fbreader.httpd.DataInterface)iin);
      }
      return new org.geometerplus.android.fbreader.httpd.DataInterface.Stub.Proxy(obj);
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
        case TRANSACTION_getPort:
        {
          data.enforceInterface(descriptor);
          int _result = this.getPort();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.geometerplus.android.fbreader.httpd.DataInterface
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
      @Override public int getPort() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPort, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPort();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static org.geometerplus.android.fbreader.httpd.DataInterface sDefaultImpl;
    }
    static final int TRANSACTION_getPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.geometerplus.android.fbreader.httpd.DataInterface impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.geometerplus.android.fbreader.httpd.DataInterface getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public int getPort() throws android.os.RemoteException;
}
