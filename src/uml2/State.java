/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The states of protocol state machines are exposed to the users of their context classifiers. A protocol state represents an exposed stable situation of its context classifier: when an instance of the classifier is not processing any operation, users of this instance can always know its state configuration.
 * A state models a situation during which some (usually implicit) invariant condition holds.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.State#getConnection <em>Connection</em>}</li>
 *   <li>{@link uml2.State#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link uml2.State#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link uml2.State#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link uml2.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link uml2.State#getExit <em>Exit</em>}</li>
 *   <li>{@link uml2.State#getIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link uml2.State#getIsOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link uml2.State#getIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link uml2.State#getIsSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link uml2.State#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link uml2.State#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link uml2.State#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link uml2.State#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getState()
 * @model
 * @generated
 */
public interface State extends Namespace, RedefinableElement, Vertex {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.ConnectionPointReference}.
	 * It is bidirectional and its opposite is '{@link uml2.ConnectionPointReference#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entry and exit connection points used in conjunction with this (submachine) state, i.e. as targets and sources, respectively, in the region with the submachine state. A connection point reference references the corresponding definition of a connection point pseudostate in the statemachine referenced by the submachinestate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see uml2.Uml2Package#getState_Connection()
	 * @see uml2.ConnectionPointReference#getState
	 * @model opposite="state" containment="true" ordered="false"
	 * @generated
	 */
	EList<ConnectionPointReference> getConnection();

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Pseudostate}.
	 * It is bidirectional and its opposite is '{@link uml2.Pseudostate#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entry and exit pseudostates of a composite state. These can only be entry or exit Pseudostates, and they must have different names. They can only be defined for composite states.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see uml2.Uml2Package#getState_ConnectionPoint()
	 * @see uml2.Pseudostate#getState
	 * @model opposite="state" containment="true" ordered="false"
	 * @generated
	 */
	EList<Pseudostate> getConnectionPoint();

	/**
	 * Returns the value of the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of triggers that are candidates to be retained by the state machine if they trigger no transitions out of the state (not consumed). A deferred trigger is retained until the state machine reaches a state configuration where it is no longer deferred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deferrable Trigger</em>' containment reference list.
	 * @see uml2.Uml2Package#getState_DeferrableTrigger()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Trigger> getDeferrableTrigger();

	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional behavior that is executed while being in the state. The execution starts when this state is entered, and stops either by itself, or when the state is exited, whichever comes first.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Activity</em>' containment reference.
	 * @see #setDoActivity(Behavior)
	 * @see uml2.Uml2Package#getState_DoActivity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Behavior getDoActivity();

	/**
	 * Sets the value of the '{@link uml2.State#getDoActivity <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Activity</em>' containment reference.
	 * @see #getDoActivity()
	 * @generated
	 */
	void setDoActivity(Behavior value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional behavior that is executed whenever this state is entered regardless of the transition taken to reach the state. If defined, entry actions are always executed to completion prior to any internal behavior or transitions performed within the state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Behavior)
	 * @see uml2.Uml2Package#getState_Entry()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Behavior getEntry();

	/**
	 * Sets the value of the '{@link uml2.State#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Behavior value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional behavior that is executed whenever this state is exited regardless of which transition was taken out of the state. If defined, exit actions are always executed to completion only after all internal activities and transition actions have completed execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(Behavior)
	 * @see uml2.Uml2Package#getState_Exit()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Behavior getExit();

	/**
	 * Sets the value of the '{@link uml2.State#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Behavior value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state with isComposite=true is said to be a composite state. A composite state is a state that contains at least one region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see uml2.Uml2Package#getState_IsComposite()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Boolean getIsComposite();

	/**
	 * Returns the value of the '<em><b>Is Orthogonal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state with isOrthogonal=true is said to be an orthogonal composite state. An orthogonal composite state contains two or more regions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Orthogonal</em>' attribute.
	 * @see uml2.Uml2Package#getState_IsOrthogonal()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Boolean getIsOrthogonal();

	/**
	 * Returns the value of the '<em><b>Is Simple</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state with isSimple=true is said to be a simple state. A simple state does not have any regions and it does not refer to any submachine state machine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Simple</em>' attribute.
	 * @see uml2.Uml2Package#getState_IsSimple()
	 * @model default="true" dataType="primitiveTypes.Boolean" required="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Boolean getIsSimple();

	/**
	 * Returns the value of the '<em><b>Is Submachine State</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state with isSubmachineState=true is said to be a submachine state. Such a state refers to a state machine (submachine).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Submachine State</em>' attribute.
	 * @see uml2.Uml2Package#getState_IsSubmachineState()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Boolean getIsSubmachineState();

	/**
	 * Returns the value of the '<em><b>Redefined State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state of which this state is a redefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined State</em>' reference.
	 * @see #setRedefinedState(State)
	 * @see uml2.Uml2Package#getState_RedefinedState()
	 * @model ordered="false"
	 * @generated
	 */
	State getRedefinedState();

	/**
	 * Sets the value of the '{@link uml2.State#getRedefinedState <em>Redefined State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined State</em>' reference.
	 * @see #getRedefinedState()
	 * @generated
	 */
	void setRedefinedState(State value);

	/**
	 * Returns the value of the '<em><b>State Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies conditions that are always true when this state is the current state. In protocol state machines, state invariants are additional conditions to the preconditions of the outgoing transitions, and to the postcondition of the incoming transitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Invariant</em>' reference.
	 * @see #setStateInvariant(Constraint)
	 * @see uml2.Uml2Package#getState_StateInvariant()
	 * @model ordered="false"
	 * @generated
	 */
	Constraint getStateInvariant();

	/**
	 * Sets the value of the '{@link uml2.State#getStateInvariant <em>State Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Invariant</em>' reference.
	 * @see #getStateInvariant()
	 * @generated
	 */
	void setStateInvariant(Constraint value);

	/**
	 * Returns the value of the '<em><b>Submachine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2.StateMachine#getSubmachineState <em>Submachine State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state machine that is to be inserted in place of the (submachine) state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submachine</em>' reference.
	 * @see #setSubmachine(StateMachine)
	 * @see uml2.Uml2Package#getState_Submachine()
	 * @see uml2.StateMachine#getSubmachineState
	 * @model opposite="submachineState" ordered="false"
	 * @generated
	 */
	StateMachine getSubmachine();

	/**
	 * Sets the value of the '{@link uml2.State#getSubmachine <em>Submachine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submachine</em>' reference.
	 * @see #getSubmachine()
	 * @generated
	 */
	void setSubmachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Region}.
	 * It is bidirectional and its opposite is '{@link uml2.Region#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The regions owned directly by the state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see uml2.Uml2Package#getState_Region()
	 * @see uml2.Region#getState
	 * @model opposite="state" containment="true" ordered="false"
	 * @generated
	 */
	EList<Region> getRegion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only composite states can have entry or exit pseudostates defined.
	 * connectionPoint->notEmpty() implies isComoposite
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='connectionPoint->notEmpty() implies isComoposite'"
	 * @generated
	 */
	boolean compositeStates(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only submachine states can have connection point references.
	 * isSubmachineState implies connection->notEmpty ( )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isSubmachineState implies connection->notEmpty ( )'"
	 * @generated
	 */
	boolean submachineStates(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only entry or exit pseudostates can serve as connection points.
	 * connectionPoint->forAll(cp|cp.kind = #entry or cp.kind = #exit)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='connectionPoint->forAll(cp|cp.kind = #entry or cp.kind = #exit)'"
	 * @generated
	 */
	boolean entryOrExit(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state is not allowed to have both a submachine and regions.
	 * isComposite implies not isSubmachineState
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isComposite implies not isSubmachineState'"
	 * @generated
	 */
	boolean submachineOrRegions(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection point references used as destinations/sources of transitions associated with a submachine state must be defined as entry/exit points in the submachine state machine.
	 * self.isSubmachineState implies (self.connection->forAll (cp |
	 * cp.entry->forAll (p | p.statemachine = self.submachine) and
	 * cp.exit->forAll (p | p.statemachine = self.submachine)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.isSubmachineState implies (self.connection->forAll (cp |\r\ncp.entry->forAll (p | p.statemachine = self.submachine) and\r\ncp.exit->forAll (p | p.statemachine = self.submachine)))'"
	 * @generated
	 */
	boolean destinationsOrSourcesOfTransitions(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A composite state is a state with at least one region.
	 * result = region.notEmpty()
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = region.notEmpty()'"
	 * @generated
	 */
	Boolean isComposite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An orthogonal state is a composite state with at least 2 regions
	 * result = (region->size () > 1)
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = (region->size () > 1)'"
	 * @generated
	 */
	Boolean isOrthogonal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of a state are properly related to the redefinition contexts of the specified state to allow this element to redefine the other. The containing region of a redefining state must redefine the containing region of the redefined state.
	 * result = true
	 * <!-- end-model-doc -->
	 * @model dataType="primitiveTypes.Boolean" required="true" ordered="false" redefinedRequired="true" redefinedOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = true'"
	 * @generated
	 */
	Boolean isRedefinitionContextValid(State redefined);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A simple state is a state without any regions.
	 * result = region.isEmpty()
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = region.isEmpty()'"
	 * @generated
	 */
	Boolean isSimple();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only submachine states can have a reference statemachine.
	 * result = submachine.notEmpty()
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = submachine.notEmpty()'"
	 * @generated
	 */
	Boolean isSubmachineState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The redefinition context of a state is the nearest containing statemachine.
	 * result = let sm = containingStateMachine() in
	 * if sm.context->isEmpty() or sm.general->notEmpty() then
	 * sm
	 * else
	 * sm.context
	 * endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = let sm = containingStateMachine() in\nif sm.context->isEmpty() or sm.general->notEmpty() then\nsm\nelse\nsm.context\nendif'"
	 * @generated
	 */
	Classifier redefinitionContext();

} // State