/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A accept event action is an action that waits for the occurrence of an event meeting specified conditions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.AcceptEventAction#getIsUnmarshall <em>Is Unmarshall</em>}</li>
 *   <li>{@link uml2.AcceptEventAction#getResult <em>Result</em>}</li>
 *   <li>{@link uml2.AcceptEventAction#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getAcceptEventAction()
 * @model
 * @generated
 */
public interface AcceptEventAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Unmarshall</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether there is a single output pin for the event, or multiple output pins for attributes of the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unmarshall</em>' attribute.
	 * @see #setIsUnmarshall(Boolean)
	 * @see uml2.Uml2Package#getAcceptEventAction_IsUnmarshall()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsUnmarshall();

	/**
	 * Sets the value of the '{@link uml2.AcceptEventAction#getIsUnmarshall <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unmarshall</em>' attribute.
	 * @see #getIsUnmarshall()
	 * @generated
	 */
	void setIsUnmarshall(Boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pins holding the received event objects or their attributes. Event objects may be copied in transmission, so identity might not be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see uml2.Uml2Package#getAcceptEventAction_Result()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OutputPin> getResult();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of events accepted by the action, as specified by triggers. For triggers with signal events, a signal of the specified type or any subtype of the specified signal type is accepted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see uml2.Uml2Package#getAcceptEventAction_Trigger()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the trigger events are all TimeEvents, there is exactly one output pin.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean triggerEvents(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AcceptEventActions may have no input pins.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean noInputPins(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isUnmarshall is true, there must be exactly one trigger for events of type SignalEvent. The number of result output pins must be the same as the number of attributes of the signal. The type and ordering of each result output pin must be the same as the corresponding attribute of the signal. The multiplicity of each result output pin must be compatible with the multiplicity of the corresponding attribute.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean unmarshallSignalEvents(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There are no output pins if the trigger events are only ChangeEvents, or if they are only CallEvents when this action is an instance of AcceptEventAction and not an instance of a descendant of AcceptEventAction (such as AcceptCallAction).
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean noOutputPins(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AcceptEventAction