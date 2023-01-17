/**
 */
package hal.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see HALResourceFactoryImpl.util.SMSSResourceFactoryImpl
 * @generated
 */
public class HALResourceImpl extends XMIResourceImpl {
    /**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
    public HALResourceImpl(URI uri) {
		super(uri);
	}
    
    @Override
    protected boolean useUUIDs() {
        return true;
    }

}
