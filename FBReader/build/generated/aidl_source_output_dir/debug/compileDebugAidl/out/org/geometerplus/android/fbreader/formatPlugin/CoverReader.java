/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.geometerplus.android.fbreader.formatPlugin;
public interface CoverReader extends android.os.IInterface
{
  /** Default implementation for CoverReader. */
  public static class Default implements org.geometerplus.android.fbreader.formatPlugin.CoverReader
  {
    @Override public android.graphics.Bitmap readBitmap(java.lang.String path, int maxWidth, int maxHeight) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.geometerplus.android.fbreader.formatPlugin.CoverReader
  {
    private static final java.lang.String DESCRIPTOR = "org.geometerplus.android.fbreader.formatPlugin.CoverReader";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.geometerplus.android.fbreader.formatPlugin.CoverReader interface,
     * generating a proxy if needed.
     */
    public static org.geometerplus.android.fbreader.formatPlugin.CoverReader asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.geometerplus.android.fbreader.formatPlugin.CoverReader))) {
        return ((org.geometerplus.android.fbreader.formatPlugin.CoverReader)iin);
      }
      return new org.geometerplus.android.fbreader.formatPlugin.CoverReader.Stub.Proxy(obj);
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
        case TRANSACTION_readBitmap:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          android.graphics.Bitmap _result = this.readBitmap(_arg0, _arg1, _arg2);
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
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.geometerplus.android.fbreader.formatPlugin.CoverReader
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
      @Override public android.graphics.Bitmap readBitmap(java.lang.String path, int maxWidth, int maxHeight) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.graphics.Bitmap _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(path);
          _data.writeInt(maxWidth);
          _data.writeInt(maxHeight);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readBitmap, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().readBitmap(path, maxWidth, maxHeight);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.graphics.Bitmap.CREATOR.createFromParcel(_reply);
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
      public static org.geometerplus.android.fbreader.formatPlugin.CoverReader sDefaultImpl;
    }
    static final int TRANSACTION_readBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.geometerplus.android.fbreader.formatPlugin.CoverReader impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.geometerplus.android.fbreader.formatPlugin.CoverReader getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public android.graphics.Bitmap readBitmap(java.lang.String path, int maxWidth, int maxHeight) throws android.os.RemoteException;
}
