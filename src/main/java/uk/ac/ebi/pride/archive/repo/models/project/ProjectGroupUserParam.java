package uk.ac.ebi.pride.archive.repo.models.project;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Rui Wang
 * @version $Id$
 */
@Entity
@DiscriminatorValue("PROJECT")
public class ProjectGroupUserParam extends ProjectUserParam {}
