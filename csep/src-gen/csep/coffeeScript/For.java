/**
 */
package csep.coffeeScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.For#getDummy <em>Dummy</em>}</li>
 *   <li>{@link csep.coffeeScript.For#getBody <em>Body</em>}</li>
 *   <li>{@link csep.coffeeScript.For#getLoop <em>Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getFor()
 * @model
 * @generated
 */
public interface For extends Expression, PrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Dummy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dummy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dummy</em>' containment reference.
   * @see #setDummy(Expression)
   * @see csep.coffeeScript.CoffeeScriptPackage#getFor_Dummy()
   * @model containment="true"
   * @generated
   */
  Expression getDummy();

  /**
   * Sets the value of the '{@link csep.coffeeScript.For#getDummy <em>Dummy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dummy</em>' containment reference.
   * @see #getDummy()
   * @generated
   */
  void setDummy(Expression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(EObject)
   * @see csep.coffeeScript.CoffeeScriptPackage#getFor_Body()
   * @model containment="true"
   * @generated
   */
  EObject getBody();

  /**
   * Sets the value of the '{@link csep.coffeeScript.For#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(EObject value);

  /**
   * Returns the value of the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' containment reference.
   * @see #setLoop(Expression)
   * @see csep.coffeeScript.CoffeeScriptPackage#getFor_Loop()
   * @model containment="true"
   * @generated
   */
  Expression getLoop();

  /**
   * Sets the value of the '{@link csep.coffeeScript.For#getLoop <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop</em>' containment reference.
   * @see #getLoop()
   * @generated
   */
  void setLoop(Expression value);

} // For
