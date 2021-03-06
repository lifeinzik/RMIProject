package common;

import registry.Stateless;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * The Sorter interface defines a service that <code>sort</code> and
 * <code>reverseSort</code> lists of <code>String</code>s.
 *
 * As a <b>remote</b> interface, Sorter must:
 * <ul>
 * <li>extends the <code>Remote</code> interface,
 * <li>have all its methods throw <code>RemoteException</code>.
 * </ul>
 *
 */
public interface Sorter extends Stateless {

  List<String> sort(List<String> list) throws RemoteException;

  List<String> reverseSort(List<String> list) throws RemoteException;

}
