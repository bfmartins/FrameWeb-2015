/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.Classifier;
import uml2.Extend;
import uml2.ExtensionPoint;
import uml2.Include;
import uml2.UseCase;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.UseCaseImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link uml2.impl.UseCaseImpl#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link uml2.impl.UseCaseImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link uml2.impl.UseCaseImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl extends BehavioredClassifierImpl implements UseCase {
	/**
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected EList<Extend> extend;

	/**
	 * The cached value of the '{@link #getExtensionPoint() <em>Extension Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionPoint> extensionPoint;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> include;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extend> getExtend() {
		if (extend == null) {
			extend = new EObjectContainmentWithInverseEList<Extend>(Extend.class, this, Uml2Package.USE_CASE__EXTEND, Uml2Package.EXTEND__EXTENSION);
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionPoint> getExtensionPoint() {
		if (extensionPoint == null) {
			extensionPoint = new EObjectContainmentWithInverseEList<ExtensionPoint>(ExtensionPoint.class, this, Uml2Package.USE_CASE__EXTENSION_POINT, Uml2Package.EXTENSION_POINT__USE_CASE);
		}
		return extensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Include> getInclude() {
		if (include == null) {
			include = new EObjectContainmentWithInverseEList<Include>(Include.class, this, Uml2Package.USE_CASE__INCLUDE, Uml2Package.INCLUDE__INCLUDING_CASE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getSubject() {
		if (subject == null) {
			subject = new EObjectWithInverseResolvingEList.ManyInverse<Classifier>(Classifier.class, this, Uml2Package.USE_CASE__SUBJECT, Uml2Package.CLASSIFIER__USE_CASE);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean mustHaveName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.USE_CASE__MUST_HAVE_NAME,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "mustHaveName", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean cannotIncludeSelf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.USE_CASE__CANNOT_INCLUDE_SELF,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "cannotIncludeSelf", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean binaryAssociations(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.USE_CASE__BINARY_ASSOCIATIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "binaryAssociations", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean noAssociationToUseCase(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.USE_CASE__NO_ASSOCIATION_TO_USE_CASE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "noAssociationToUseCase", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> allIncludedUseCases() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.USE_CASE__EXTEND:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtend()).basicAdd(otherEnd, msgs);
			case Uml2Package.USE_CASE__EXTENSION_POINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensionPoint()).basicAdd(otherEnd, msgs);
			case Uml2Package.USE_CASE__INCLUDE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInclude()).basicAdd(otherEnd, msgs);
			case Uml2Package.USE_CASE__SUBJECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubject()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.USE_CASE__EXTEND:
				return ((InternalEList<?>)getExtend()).basicRemove(otherEnd, msgs);
			case Uml2Package.USE_CASE__EXTENSION_POINT:
				return ((InternalEList<?>)getExtensionPoint()).basicRemove(otherEnd, msgs);
			case Uml2Package.USE_CASE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case Uml2Package.USE_CASE__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.USE_CASE__EXTEND:
				return getExtend();
			case Uml2Package.USE_CASE__EXTENSION_POINT:
				return getExtensionPoint();
			case Uml2Package.USE_CASE__INCLUDE:
				return getInclude();
			case Uml2Package.USE_CASE__SUBJECT:
				return getSubject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Uml2Package.USE_CASE__EXTEND:
				getExtend().clear();
				getExtend().addAll((Collection<? extends Extend>)newValue);
				return;
			case Uml2Package.USE_CASE__EXTENSION_POINT:
				getExtensionPoint().clear();
				getExtensionPoint().addAll((Collection<? extends ExtensionPoint>)newValue);
				return;
			case Uml2Package.USE_CASE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends Include>)newValue);
				return;
			case Uml2Package.USE_CASE__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Classifier>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Uml2Package.USE_CASE__EXTEND:
				getExtend().clear();
				return;
			case Uml2Package.USE_CASE__EXTENSION_POINT:
				getExtensionPoint().clear();
				return;
			case Uml2Package.USE_CASE__INCLUDE:
				getInclude().clear();
				return;
			case Uml2Package.USE_CASE__SUBJECT:
				getSubject().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Uml2Package.USE_CASE__EXTEND:
				return extend != null && !extend.isEmpty();
			case Uml2Package.USE_CASE__EXTENSION_POINT:
				return extensionPoint != null && !extensionPoint.isEmpty();
			case Uml2Package.USE_CASE__INCLUDE:
				return include != null && !include.isEmpty();
			case Uml2Package.USE_CASE__SUBJECT:
				return subject != null && !subject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Uml2Package.USE_CASE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP:
				return mustHaveName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.USE_CASE___CANNOT_INCLUDE_SELF__DIAGNOSTICCHAIN_MAP:
				return cannotIncludeSelf((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.USE_CASE___BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP:
				return binaryAssociations((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.USE_CASE___NO_ASSOCIATION_TO_USE_CASE__DIAGNOSTICCHAIN_MAP:
				return noAssociationToUseCase((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.USE_CASE___ALL_INCLUDED_USE_CASES:
				return allIncludedUseCases();
		}
		return super.eInvoke(operationID, arguments);
	}

} //UseCaseImpl