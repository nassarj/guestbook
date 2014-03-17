package de.jknowledge.guestbook.repository.jpa;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import de.jknowledge.guestbook.domain.model.Guestbook;
import de.jknowledge.guestbook.repository.common.GuestbookRepository;

public class JpaGuestbookRepository extends GenericJpaRepository<Guestbook>
		implements GuestbookRepository {
	
	@Override
	public List<Guestbook> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Guestbook> q = cb.createQuery(Guestbook.class);
		Root<Guestbook> root = q.from(Guestbook.class);
		q.select(root);
		q.orderBy(cb.desc(root.get("creationDate")));
		TypedQuery<Guestbook> query = em.createQuery(q);
		List<Guestbook> results = query.getResultList();
		return results;
	}

}
