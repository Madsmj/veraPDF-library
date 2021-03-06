package org.verapdf.features;

import org.verapdf.core.FeatureParsingException;
import org.verapdf.features.tools.FeatureTreeNode;
import org.verapdf.features.tools.FeaturesCollection;

/**
 * Main interface for all features objects
 *
 * @author Maksim Bezrukov
 */
public interface IFeaturesObject {

	/**
	 * @return enum type of the current feature object
	 */
	FeaturesObjectTypesEnum getType();

	/**
	 * Reports all features from the object into the collection
	 *
	 * @param collection collection for feature report
	 * @return FeatureTreeNode class which represents a root node of the constructed collection tree
	 * @throws FeatureParsingException occurs when wrong features tree node constructs
	 */
	FeatureTreeNode reportFeatures(FeaturesCollection collection) throws FeatureParsingException;

	/**
	 * @return features data for object
	 */
	FeaturesData getData();
}
