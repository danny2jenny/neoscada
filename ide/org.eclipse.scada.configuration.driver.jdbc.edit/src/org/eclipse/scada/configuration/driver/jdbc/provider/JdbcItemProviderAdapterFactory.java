/**
 * Copyright (c) 2014 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 *
 */
package org.eclipse.scada.configuration.driver.jdbc.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.scada.configuration.component.ComponentPackage;
import org.eclipse.scada.configuration.component.Level;
import org.eclipse.scada.configuration.component.util.ComponentSwitch;
import org.eclipse.scada.configuration.driver.jdbc.JdbcFactory;
import org.eclipse.scada.configuration.driver.jdbc.JdbcPackage;
import org.eclipse.scada.configuration.driver.jdbc.util.JdbcAdapterFactory;
import org.eclipse.scada.configuration.infrastructure.InfrastructurePackage;
import org.eclipse.scada.configuration.infrastructure.SystemNode;
import org.eclipse.scada.configuration.infrastructure.util.InfrastructureSwitch;
import org.eclipse.scada.configuration.world.ApplicationNode;
import org.eclipse.scada.configuration.world.WorldPackage;
import org.eclipse.scada.configuration.world.util.WorldSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JdbcItemProviderAdapterFactory extends JdbcAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
{
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier ();

    /**
     * This helps manage the child creation extenders.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager ( JdbcEditPlugin.INSTANCE, JdbcPackage.eNS_URI );

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object> ();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JdbcItemProviderAdapterFactory ()
    {
        supportedTypes.add ( IEditingDomainItemProvider.class );
        supportedTypes.add ( IStructuredItemContentProvider.class );
        supportedTypes.add ( ITreeItemContentProvider.class );
        supportedTypes.add ( IItemLabelProvider.class );
        supportedTypes.add ( IItemPropertySource.class );
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.configuration.driver.jdbc.JdbcDriverInstance} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JdbcDriverInstanceItemProvider jdbcDriverInstanceItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.configuration.driver.jdbc.JdbcDriverInstance}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createJdbcDriverInstanceAdapter ()
    {
        if ( jdbcDriverInstanceItemProvider == null )
        {
            jdbcDriverInstanceItemProvider = new JdbcDriverInstanceItemProvider ( this );
        }

        return jdbcDriverInstanceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.configuration.driver.jdbc.UpdateCommand} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UpdateCommandItemProvider updateCommandItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.configuration.driver.jdbc.UpdateCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createUpdateCommandAdapter ()
    {
        if ( updateCommandItemProvider == null )
        {
            updateCommandItemProvider = new UpdateCommandItemProvider ( this );
        }

        return updateCommandItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.configuration.driver.jdbc.QueryComponent} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QueryComponentItemProvider queryComponentItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.configuration.driver.jdbc.QueryComponent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createQueryComponentAdapter ()
    {
        if ( queryComponentItemProvider == null )
        {
            queryComponentItemProvider = new QueryComponentItemProvider ( this );
        }

        return queryComponentItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.configuration.driver.jdbc.UpdateMapping} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UpdateMappingItemProvider updateMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.configuration.driver.jdbc.UpdateMapping}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createUpdateMappingAdapter ()
    {
        if ( updateMappingItemProvider == null )
        {
            updateMappingItemProvider = new UpdateMappingItemProvider ( this );
        }

        return updateMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.configuration.driver.jdbc.ColumnMapping} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ColumnMappingItemProvider columnMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.configuration.driver.jdbc.ColumnMapping}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createColumnMappingAdapter ()
    {
        if ( columnMappingItemProvider == null )
        {
            columnMappingItemProvider = new ColumnMappingItemProvider ( this );
        }

        return columnMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.configuration.driver.jdbc.JdbcDriver} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JdbcDriverItemProvider jdbcDriverItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.configuration.driver.jdbc.JdbcDriver}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createJdbcDriverAdapter ()
    {
        if ( jdbcDriverItemProvider == null )
        {
            jdbcDriverItemProvider = new JdbcDriverItemProvider ( this );
        }

        return jdbcDriverItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory ()
    {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory ();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAdapterFactory ( ComposedAdapterFactory parentAdapterFactory )
    {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType ( Object type )
    {
        return supportedTypes.contains ( type ) || super.isFactoryForType ( type );
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt ( Notifier notifier, Object type )
    {
        return super.adapt ( notifier, this );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt ( Object object, Object type )
    {
        if ( isFactoryForType ( type ) )
        {
            Object adapter = super.adapt ( object, type );
            if ( ! ( type instanceof Class<?> ) || ( ( (Class<?>)type ).isInstance ( adapter ) ) )
            {
                return adapter;
            }
        }

        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<IChildCreationExtender> getChildCreationExtenders ()
    {
        return childCreationExtenderManager.getChildCreationExtenders ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<?> getNewChildDescriptors ( Object object, EditingDomain editingDomain )
    {
        return childCreationExtenderManager.getNewChildDescriptors ( object, editingDomain );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator ()
    {
        return childCreationExtenderManager;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void addListener ( INotifyChangedListener notifyChangedListener )
    {
        changeNotifier.addListener ( notifyChangedListener );
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void removeListener ( INotifyChangedListener notifyChangedListener )
    {
        changeNotifier.removeListener ( notifyChangedListener );
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void fireNotifyChanged ( Notification notification )
    {
        changeNotifier.fireNotifyChanged ( notification );

        if ( parentAdapterFactory != null )
        {
            parentAdapterFactory.fireNotifyChanged ( notification );
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void dispose ()
    {
        if ( jdbcDriverInstanceItemProvider != null )
            jdbcDriverInstanceItemProvider.dispose ();
        if ( updateCommandItemProvider != null )
            updateCommandItemProvider.dispose ();
        if ( queryComponentItemProvider != null )
            queryComponentItemProvider.dispose ();
        if ( updateMappingItemProvider != null )
            updateMappingItemProvider.dispose ();
        if ( columnMappingItemProvider != null )
            columnMappingItemProvider.dispose ();
        if ( jdbcDriverItemProvider != null )
            jdbcDriverItemProvider.dispose ();
    }

    /**
     * A child creation extender for the {@link ComponentPackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static class ComponentChildCreationExtender implements IChildCreationExtender
    {
        /**
         * The switch for creating child descriptors specific to each extended class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static class CreationSwitch extends ComponentSwitch<Object>
        {
            /**
             * The child descriptors being populated.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected List<Object> newChildDescriptors;

            /**
             * The domain in which to create the children.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected EditingDomain editingDomain;

            /**
             * Creates the a switch for populating child descriptors in the given domain.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            CreationSwitch ( List<Object> newChildDescriptors, EditingDomain editingDomain )
            {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }

            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseLevel ( Level object )
            {
                newChildDescriptors.add
                        ( createChildParameter
                        ( ComponentPackage.Literals.LEVEL__COMPONENTS,
                                JdbcFactory.eINSTANCE.createUpdateCommand () ) );

                newChildDescriptors.add
                        ( createChildParameter
                        ( ComponentPackage.Literals.LEVEL__COMPONENTS,
                                JdbcFactory.eINSTANCE.createQueryComponent () ) );

                return null;
            }

            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected CommandParameter createChildParameter ( Object feature, Object child )
            {
                return new CommandParameter ( null, feature, child );
            }

        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Collection<Object> getNewChildDescriptors ( Object object, EditingDomain editingDomain )
        {
            ArrayList<Object> result = new ArrayList<Object> ();
            new CreationSwitch ( result, editingDomain ).doSwitch ( (EObject)object );
            return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public ResourceLocator getResourceLocator ()
        {
            return JdbcEditPlugin.INSTANCE;
        }
    }

    /**
     * A child creation extender for the {@link InfrastructurePackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static class InfrastructureChildCreationExtender implements IChildCreationExtender
    {
        /**
         * The switch for creating child descriptors specific to each extended class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static class CreationSwitch extends InfrastructureSwitch<Object>
        {
            /**
             * The child descriptors being populated.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected List<Object> newChildDescriptors;

            /**
             * The domain in which to create the children.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected EditingDomain editingDomain;

            /**
             * Creates the a switch for populating child descriptors in the given domain.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            CreationSwitch ( List<Object> newChildDescriptors, EditingDomain editingDomain )
            {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }

            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseSystemNode ( SystemNode object )
            {
                newChildDescriptors.add
                        ( createChildParameter
                        ( InfrastructurePackage.Literals.SYSTEM_NODE__DRIVERS,
                                JdbcFactory.eINSTANCE.createJdbcDriver () ) );

                return null;
            }

            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected CommandParameter createChildParameter ( Object feature, Object child )
            {
                return new CommandParameter ( null, feature, child );
            }

        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Collection<Object> getNewChildDescriptors ( Object object, EditingDomain editingDomain )
        {
            ArrayList<Object> result = new ArrayList<Object> ();
            new CreationSwitch ( result, editingDomain ).doSwitch ( (EObject)object );
            return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ResourceLocator getResourceLocator ()
        {
            return JdbcEditPlugin.INSTANCE;
        }
    }

    /**
     * A child creation extender for the {@link WorldPackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static class WorldChildCreationExtender implements IChildCreationExtender
    {
        /**
         * The switch for creating child descriptors specific to each extended class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static class CreationSwitch extends WorldSwitch<Object>
        {
            /**
             * The child descriptors being populated.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected List<Object> newChildDescriptors;

            /**
             * The domain in which to create the children.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected EditingDomain editingDomain;

            /**
             * Creates the a switch for populating child descriptors in the given domain.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            CreationSwitch ( List<Object> newChildDescriptors, EditingDomain editingDomain )
            {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }

            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseApplicationNode ( ApplicationNode object )
            {
                newChildDescriptors.add
                        ( createChildParameter
                        ( WorldPackage.Literals.APPLICATION_NODE__APPLICATIONS,
                                JdbcFactory.eINSTANCE.createJdbcDriverInstance () ) );

                return null;
            }

            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected CommandParameter createChildParameter ( Object feature, Object child )
            {
                return new CommandParameter ( null, feature, child );
            }

        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Collection<Object> getNewChildDescriptors ( Object object, EditingDomain editingDomain )
        {
            ArrayList<Object> result = new ArrayList<Object> ();
            new CreationSwitch ( result, editingDomain ).doSwitch ( (EObject)object );
            return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public ResourceLocator getResourceLocator ()
        {
            return JdbcEditPlugin.INSTANCE;
        }
    }

}
