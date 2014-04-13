package de.timoklostermann.mxtracker.configuration;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

import de.timoklostermann.mxtracker.entity.Status;

public class OfyService {
	static {
		factory().register(Status.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}
