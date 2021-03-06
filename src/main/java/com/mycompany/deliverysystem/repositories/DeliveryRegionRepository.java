/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deliverysystem.repositories;

import com.mycompany.deliverysystem.entities.DeliveryRegion;

/**
 *
 * @author rafael, dominik
 */
public interface DeliveryRegionRepository extends Repository<DeliveryRegion>{
    public DeliveryRegion getByExternalId(String id) throws RepositoryException;
    public DeliveryRegion getByLocation(double longitude, double latitude) throws RepositoryException;
    public DeliveryRegion getClosestByLocation(double longitude, double latitude) throws RepositoryException;
}
