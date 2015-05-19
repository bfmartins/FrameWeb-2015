/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.PageDependency#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link frameweb.PageDependency#getSourceTemplate <em>Source Template</em>}</li>
 *   <li>{@link frameweb.PageDependency#getLinkHTML <em>Link HTML</em>}</li>
 *   <li>{@link frameweb.PageDependency#getSourcePage <em>Source Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getPageDependency()
 * @model
 * @generated
 */
public interface PageDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Page</em>' reference.
	 * @see #setTargetPage(Page)
	 * @see frameweb.FramewebPackage#getPageDependency_TargetPage()
	 * @model required="true"
	 * @generated
	 */
	Page getTargetPage();

	/**
	 * Sets the value of the '{@link frameweb.PageDependency#getTargetPage <em>Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Page</em>' reference.
	 * @see #getTargetPage()
	 * @generated
	 */
	void setTargetPage(Page value);

	/**
	 * Returns the value of the '<em><b>Source Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Template</em>' reference.
	 * @see #setSourceTemplate(Template)
	 * @see frameweb.FramewebPackage#getPageDependency_SourceTemplate()
	 * @model
	 * @generated
	 */
	Template getSourceTemplate();

	/**
	 * Sets the value of the '{@link frameweb.PageDependency#getSourceTemplate <em>Source Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Template</em>' reference.
	 * @see #getSourceTemplate()
	 * @generated
	 */
	void setSourceTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Link HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link HTML</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link HTML</em>' attribute.
	 * @see #setLinkHTML(String)
	 * @see frameweb.FramewebPackage#getPageDependency_LinkHTML()
	 * @model
	 * @generated
	 */
	String getLinkHTML();

	/**
	 * Sets the value of the '{@link frameweb.PageDependency#getLinkHTML <em>Link HTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link HTML</em>' attribute.
	 * @see #getLinkHTML()
	 * @generated
	 */
	void setLinkHTML(String value);

	/**
	 * Returns the value of the '<em><b>Source Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Page</em>' reference.
	 * @see #setSourcePage(Page)
	 * @see frameweb.FramewebPackage#getPageDependency_SourcePage()
	 * @model
	 * @generated
	 */
	Page getSourcePage();

	/**
	 * Sets the value of the '{@link frameweb.PageDependency#getSourcePage <em>Source Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Page</em>' reference.
	 * @see #getSourcePage()
	 * @generated
	 */
	void setSourcePage(Page value);

} // PageDependency