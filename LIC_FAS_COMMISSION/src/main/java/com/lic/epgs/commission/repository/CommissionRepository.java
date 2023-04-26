@Repository
public interface CommissionRepository extends JpaRepository<CommonCommissionDto, Long>{

	List<CommonCommissionDto> findByStatus(String status);
	
	@Transactional
	@Modifying
	@Query("UPDATE CommonCommissionDto c SET c.status=:status WHERE c.id=:id")
	int updateStatus(@Param("status") String status, @Param("id") Long id);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM CommonCommissionDto c WHERE c.status=:status")
	int deleteByStatus(@Param("status") String status);
	
	@Transactional
	@Modifying
	@Query("SELECT c FROM CommonCommissionDto c WHERE c.status=:status")
	List<CommonCommissionDto> loadQuestionMaster(@Param("status") String status);

}