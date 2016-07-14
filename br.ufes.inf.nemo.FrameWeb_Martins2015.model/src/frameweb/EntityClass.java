/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.EntityClass#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getEntityClass()
 * @model
 * @generated
 */
public interface EntityClass extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(String)
	 * @see frameweb.FramewebPackage#getEntityClass_Table()
	 * @model
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link frameweb.EntityClass#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

} // EntityClass