/**
 */
package csep.coffeeScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.Array#isSplat <em>Splat</em>}</li>
 *   <li>{@link csep.coffeeScript.Array#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends PrimaryExpression, Param
{
  /**
   * Returns the value of the '<em><b>Splat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Splat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Splat</em>' attribute.
   * @see #setSplat(boolean)
   * @see csep.coffeeScript.CoffeeScriptPackage#getArray_Splat()
   * @model
   * @generated
   */
  boolean isSplat();

  /**
   * Sets the value of the '{@link csep.coffeeScript.Array#isSplat <em>Splat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Splat</em>' attribute.
   * @see #isSplat()
   * @generated
   */
  void setSplat(boolean value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' containment reference.
   * @see #setDefaultValue(Expression)
   * @see csep.coffeeScript.CoffeeScriptPackage#getArray_DefaultValue()
   * @model containment="true"
   * @generated
   */
  Expression getDefaultValue();

  /**
   * Sets the value of the '{@link csep.coffeeScript.Array#getDefaultValue <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' containment reference.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(Expression value);

} // Array
