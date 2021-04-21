package com.season.book.other;
57. UPDATE�н���������
	UPDATE message_statistics statistics
		INNER JOIN jpush_user_tags jut ON jut.userId = statistics.statisticsUserId
		SET statistics.statisticsUnreadNum = statistics.statisticsUnreadNum + 1,
			statistics.modifiedDate = #{now}
		WHERE
			statistics.statisticsType = 'ACTIVITY_NOTICE'
			and jut.tagId in 
			<foreach collection="tagSet" open="(" close=")" separator="," item="type">
                #{type}
            </foreach>
    -- ֻ������ update��ֻ����һ���������

58. Ϲ�룬���������ݿ��ԭ���ԣ����в������ƣ�������where�����н������ƣ�
	����where������Ҫִ�кܳ�ʱ�䣬�᲻����Ϊִ�й��������ݷ����˸ı䣬����where�����е����ݳ��ֻö������������

59. ��Ҫ������б���

60. �����ϲ�ѯ�����У�Ҫ��֤��ߵı���С����Ϊ����ʼ�飬�����ܱ�֤��ѯ�ٶȿ�һЩ

61. 

62. 

63. 

64. 

65. 

66. 

67. 

68. 

69. 

70. 



file:///C:/Users/season/Documents/Fiddler2/Scripts/BrowserPAC.js




