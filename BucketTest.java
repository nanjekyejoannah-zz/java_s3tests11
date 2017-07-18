package BucketTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

public class BucketTestNGTest {
	
	AWSCredentials credentials = null;

    AmazonS3 s3 = new AmazonS3Client(credentials);
    Region usWest2 = Region.getRegion(Regions.US_WEST_2);
    s3.setRegion("mexico");
    s3.setEndpoint("localhost:8000");
    s3.setAWSAccessKeyId("0555b35654ad1656d804");
    s3.setAWSSecretKey("h7GhxuBLTrlhVUyxSPUKUV8r/2EI4ngqJxD7iBdBYLhwluN30JaT3Q==");
    
    String bucketName = "some"
    
  @Test
  public void bucketCreateReadDelete() {
	  s3.createBucket(bucketName);
	  Assert.assertEquals(len(s3.listBuckets()), 2);
  }
  
  @AfterTest
  public void Delete() {
	  
	  s3.deleteBucket(bucketName);
  }
  
  
}
