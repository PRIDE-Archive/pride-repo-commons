package uk.ac.ebi.pride.archive.repo.models.assay;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Jose A. Dianes
 * @version $Id$
 */
@Entity
@DiscriminatorValue("ASSAY")
public class AssayGroupCvParam extends AssayCvParam {}
