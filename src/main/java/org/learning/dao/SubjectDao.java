package org.learning.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.learning.entity.Subject;

public class SubjectDao {

	Map<Integer, List<Subject>> classSubjectMap;

	public SubjectDao() {
		classSubjectMap = new HashMap<Integer, List<Subject>>();

		List<Subject> class1_subjects = new ArrayList<Subject>();
		List<Subject> class2_subjects = new ArrayList<Subject>();
		List<Subject> class3_subjects = new ArrayList<Subject>();

		class1_subjects.add(new Subject(101, "Maths", "George"));
		class1_subjects.add(new Subject(102, "English", "Alpha"));
		class1_subjects.add(new Subject(103, "Hindi", "Babool"));
		class1_subjects.add(new Subject(104, "Social", "Tin fong"));

		class2_subjects.add(new Subject(101, "Maths", "George"));
		class2_subjects.add(new Subject(102, "English", "Alpha"));
		class2_subjects.add(new Subject(103, "Sanskrit", "Tukaram"));
		class2_subjects.add(new Subject(105, "SocialStudies", "Bholaram"));

		class3_subjects.add(new Subject(101, "Maths", "George"));
		class3_subjects.add(new Subject(102, "English", "Alpha"));
		class3_subjects.add(new Subject(103, "Sanskrit", "Tukaram"));
		class3_subjects.add(new Subject(105, "SocialStudies", "Bholaram"));
		class3_subjects.add(new Subject(107, "Science", "xyz"));
		class3_subjects.add(new Subject(108, "French", "doulingo"));

		classSubjectMap.put(1, class1_subjects);
		classSubjectMap.put(2, class2_subjects);
		classSubjectMap.put(3, class3_subjects);

	}

	public List<Subject> getClassSubject(int class_std) {
		return classSubjectMap.get(class_std);
	}

	public Map<Integer, List<Subject>> getAllSubjects() {
		return classSubjectMap;
	}

	public List<Subject> allSubjectList() {
		Set<Entry<Integer, List<Subject>>> entrySet = classSubjectMap.entrySet();

		List<Subject> result = new ArrayList<Subject>();
		Iterator<Entry<Integer, List<Subject>>> it = entrySet.iterator();
		Set<Integer> set = new HashSet<Integer>();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			List<Subject> sub = (List<Subject>) me.getValue();
			for (Subject ss : sub) {

				if (!set.contains(ss.getId())) {
					result.add(ss);
					set.add(ss.getId());
				}
			}
		}
		return result;
	}

}
