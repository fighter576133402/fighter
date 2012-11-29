/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: E:\\development\\workspace\\github\\fighter\\AIDLService\\src\\cn\\com\\uangel\\aidlservice\\IMyService.aidl
 */
package cn.com.uangel.aidlservice;
//  IMyService.aidl文件的内容与Java代码非常相似，但要注意，不能加修饰符（例如，public、private）、AIDL服务不支持的数据类型（例如，InputStream、OutputStream）等内容。

public interface IMyService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cn.com.uangel.aidlservice.IMyService
{
private static final java.lang.String DESCRIPTOR = "cn.com.uangel.aidlservice.IMyService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cn.com.uangel.aidlservice.IMyService interface,
 * generating a proxy if needed.
 */
public static cn.com.uangel.aidlservice.IMyService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cn.com.uangel.aidlservice.IMyService))) {
return ((cn.com.uangel.aidlservice.IMyService)iin);
}
return new cn.com.uangel.aidlservice.IMyService.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getValue:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getValue();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cn.com.uangel.aidlservice.IMyService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public java.lang.String getValue() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getValue, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public java.lang.String getValue() throws android.os.RemoteException;
}
