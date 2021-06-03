package resources;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.FormDataParam;
import resources.pojos.Pet;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.io.*;
import java.util.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

@Path("Owner/{owner_id}/pet/{pet_id}")


public class PetResource {
    final String UPLOAD_FILE_SERVER = "C:\\";
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("owner_id") Integer id, @PathParam("pet_id") Integer petid, Pet pet) {
        return Response.ok()
                .entity(pet)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("owner_id") Integer id, @PathParam("pet_id") Integer petid) {

        return Response.noContent()
                .build();
    }


    @POST
    @Path("/upload")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response uploadImageFile(
            @FormDataParam("fichero") InputStream fileInputStream,
            @FormDataParam("fichero") File fileFormDataContentDisposition) {

        String fileName = null;
        String uploadFilePath = null;

        try {

            fileName = fileFormDataContentDisposition.getName();
            uploadFilePath = writeToFileServer(fileInputStream, fileName);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
        }
        return Response.ok("Fichero subido a " + uploadFilePath).build();
    }

    private String writeToFileServer(InputStream inputStream, String fileName) throws IOException {

        OutputStream outputStream = null;
        System.out.println(UPLOAD_FILE_SERVER+fileName);
        String qualifiedUploadFilePath = UPLOAD_FILE_SERVER +fileName;

        try {
            outputStream = new FileOutputStream(new File(qualifiedUploadFilePath));
            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
            outputStream.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            outputStream.close();
        }
        return qualifiedUploadFilePath;
    }
    @POST
    @Path("/upload2")
    @Consumes({MediaType.MULTIPART_FORM_DATA})
    public Response uploadFileWithData(@FormDataParam("ficheroa") InputStream fileInputStream, @FormDataParam("ficheroa") File File2)throws Exception{
        System.out.println("hola");
        System.out.println(fileInputStream);
        Image img = ImageIO.read(File2);
        JOptionPane.showMessageDialog(null, new JLabel(new ImageIcon(img)));

        return Response.ok("Cool Tools!").build();
    }
}

